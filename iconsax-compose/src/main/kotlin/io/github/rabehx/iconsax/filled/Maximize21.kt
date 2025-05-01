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


val Iconsax.Filled.Maximize21: ImageVector
    get() {
        if (_Maximize21 != null) {
            return _Maximize21!!
        }
        _Maximize21 = ImageVector.Builder(
            name = "Filled.Maximize21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11f, 21.1f, 10.1f, 22f, 7.85f, 22f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2f, 13.9f, 2.9f, 13f, 5.15f, 13f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 13f, 11f, 13.9f, 11f, 16.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.48f, 2f)
                horizontalLineTo(8.52f)
                curveTo(5.47f, 2f, 3f, 4.47f, 3f, 7.52f)
                verticalLineTo(10.5f)
                curveTo(3f, 11.05f, 3.45f, 11.5f, 4f, 11.5f)
                horizontalLineTo(8.5f)
                curveTo(10.71f, 11.5f, 12.5f, 13.29f, 12.5f, 15.5f)
                verticalLineTo(20f)
                curveTo(12.5f, 20.55f, 12.95f, 21f, 13.5f, 21f)
                horizontalLineTo(16.48f)
                curveTo(19.93f, 21f, 22f, 18.94f, 22f, 15.48f)
                verticalLineTo(7.52f)
                curveTo(22f, 4.47f, 19.53f, 2f, 16.48f, 2f)
                close()
                moveTo(18.76f, 9.99f)
                curveTo(18.76f, 10.4f, 18.42f, 10.74f, 18.01f, 10.74f)
                curveTo(17.6f, 10.74f, 17.26f, 10.4f, 17.26f, 9.99f)
                verticalLineTo(7.79f)
                lineTo(13.53f, 11.53f)
                curveTo(13.38f, 11.68f, 13.19f, 11.75f, 13f, 11.75f)
                curveTo(12.81f, 11.75f, 12.62f, 11.68f, 12.47f, 11.53f)
                curveTo(12.18f, 11.24f, 12.18f, 10.76f, 12.47f, 10.47f)
                lineTo(16.2f, 6.72f)
                horizontalLineTo(14f)
                curveTo(13.58f, 6.72f, 13.25f, 6.39f, 13.25f, 5.97f)
                curveTo(13.25f, 5.56f, 13.58f, 5.22f, 14f, 5.22f)
                horizontalLineTo(18.01f)
                curveTo(18.1f, 5.22f, 18.19f, 5.25f, 18.27f, 5.28f)
                curveTo(18.3f, 5.29f, 18.32f, 5.3f, 18.34f, 5.31f)
                curveTo(18.4f, 5.34f, 18.45f, 5.37f, 18.5f, 5.42f)
                curveTo(18.52f, 5.43f, 18.54f, 5.45f, 18.56f, 5.47f)
                curveTo(18.61f, 5.53f, 18.65f, 5.59f, 18.69f, 5.66f)
                curveTo(18.69f, 5.67f, 18.7f, 5.68f, 18.7f, 5.69f)
                curveTo(18.74f, 5.77f, 18.75f, 5.86f, 18.75f, 5.95f)
                curveTo(18.76f, 5.96f, 18.76f, 5.96f, 18.76f, 5.97f)
                verticalLineTo(9.99f)
                close()
            }
        }.build()

        return _Maximize21!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize21: ImageVector? = null
