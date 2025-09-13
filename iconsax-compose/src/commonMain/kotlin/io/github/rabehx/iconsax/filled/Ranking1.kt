/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Ranking1: ImageVector
    get() {
        if (_Ranking1 != null) {
            return _Ranking1!!
        }
        _Ranking1 = ImageVector.Builder(
            name = "Filled.Ranking1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.67f, 14f)
                horizontalLineTo(4f)
                curveTo(2.9f, 14f, 2f, 14.9f, 2f, 16f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(6.67f)
                curveTo(7.22f, 22f, 7.67f, 21.55f, 7.67f, 21f)
                verticalLineTo(15f)
                curveTo(7.67f, 14.45f, 7.22f, 14f, 6.67f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.33f, 10f)
                horizontalLineTo(10.66f)
                curveTo(9.56f, 10f, 8.66f, 10.9f, 8.66f, 12f)
                verticalLineTo(21f)
                curveTo(8.66f, 21.55f, 9.11f, 22f, 9.66f, 22f)
                horizontalLineTo(14.33f)
                curveTo(14.88f, 22f, 15.33f, 21.55f, 15.33f, 21f)
                verticalLineTo(12f)
                curveTo(15.33f, 10.9f, 14.44f, 10f, 13.33f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 17f)
                horizontalLineTo(17.33f)
                curveTo(16.78f, 17f, 16.33f, 17.45f, 16.33f, 18f)
                verticalLineTo(21f)
                curveTo(16.33f, 21.55f, 16.78f, 22f, 17.33f, 22f)
                horizontalLineTo(21f)
                curveTo(21.55f, 22f, 22f, 21.55f, 22f, 21f)
                verticalLineTo(19f)
                curveTo(22f, 17.9f, 21.1f, 17f, 20f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.009f, 4.85f)
                curveTo(15.319f, 4.54f, 15.439f, 4.17f, 15.34f, 3.85f)
                curveTo(15.24f, 3.53f, 14.929f, 3.3f, 14.49f, 3.23f)
                lineTo(13.53f, 3.07f)
                curveTo(13.49f, 3.07f, 13.399f, 3f, 13.38f, 2.96f)
                lineTo(12.849f, 1.9f)
                curveTo(12.45f, 1.09f, 11.54f, 1.09f, 11.139f, 1.9f)
                lineTo(10.609f, 2.96f)
                curveTo(10.599f, 3f, 10.509f, 3.07f, 10.469f, 3.07f)
                lineTo(9.509f, 3.23f)
                curveTo(9.069f, 3.3f, 8.769f, 3.53f, 8.659f, 3.85f)
                curveTo(8.559f, 4.17f, 8.679f, 4.54f, 8.989f, 4.85f)
                lineTo(9.729f, 5.6f)
                curveTo(9.769f, 5.63f, 9.799f, 5.75f, 9.789f, 5.79f)
                lineTo(9.579f, 6.71f)
                curveTo(9.419f, 7.4f, 9.679f, 7.71f, 9.849f, 7.83f)
                curveTo(10.019f, 7.95f, 10.389f, 8.11f, 11f, 7.75f)
                lineTo(11.899f, 7.22f)
                curveTo(11.939f, 7.19f, 12.069f, 7.19f, 12.109f, 7.22f)
                lineTo(13f, 7.75f)
                curveTo(13.28f, 7.92f, 13.509f, 7.97f, 13.689f, 7.97f)
                curveTo(13.899f, 7.97f, 14.05f, 7.89f, 14.139f, 7.83f)
                curveTo(14.309f, 7.71f, 14.569f, 7.4f, 14.41f, 6.71f)
                lineTo(14.2f, 5.79f)
                curveTo(14.189f, 5.74f, 14.219f, 5.63f, 14.259f, 5.6f)
                lineTo(15.009f, 4.85f)
                close()
            }
        }.build()

        return _Ranking1!!
    }

@Suppress("ObjectPropertyName")
private var _Ranking1: ImageVector? = null
