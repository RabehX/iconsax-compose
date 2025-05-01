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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Forward15Seconds: ImageVector
    get() {
        if (_Forward15Seconds != null) {
            return _Forward15Seconds!!
        }
        _Forward15Seconds = ImageVector.Builder(
            name = "Outline.Forward15Seconds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.429f, 16.92f)
                horizontalLineTo(12.139f)
                curveTo(11.729f, 16.92f, 11.389f, 16.58f, 11.389f, 16.17f)
                curveTo(11.389f, 15.76f, 11.729f, 15.42f, 12.139f, 15.42f)
                horizontalLineTo(14.429f)
                curveTo(14.859f, 15.42f, 15.21f, 15.07f, 15.21f, 14.64f)
                curveTo(15.21f, 14.21f, 14.859f, 13.86f, 14.429f, 13.86f)
                horizontalLineTo(12.139f)
                curveTo(11.899f, 13.86f, 11.67f, 13.74f, 11.53f, 13.55f)
                curveTo(11.389f, 13.36f, 11.349f, 13.1f, 11.429f, 12.87f)
                lineTo(12.189f, 10.58f)
                curveTo(12.289f, 10.27f, 12.58f, 10.07f, 12.899f, 10.07f)
                horizontalLineTo(15.96f)
                curveTo(16.369f, 10.07f, 16.709f, 10.41f, 16.709f, 10.82f)
                curveTo(16.709f, 11.23f, 16.369f, 11.57f, 15.96f, 11.57f)
                horizontalLineTo(13.439f)
                lineTo(13.179f, 12.36f)
                horizontalLineTo(14.429f)
                curveTo(15.689f, 12.36f, 16.709f, 13.38f, 16.709f, 14.64f)
                curveTo(16.709f, 15.9f, 15.679f, 16.92f, 14.429f, 16.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.54f, 16.92f)
                curveTo(9.13f, 16.92f, 8.79f, 16.58f, 8.79f, 16.17f)
                verticalLineTo(12.78f)
                lineTo(8.6f, 13f)
                curveTo(8.32f, 13.31f, 7.85f, 13.33f, 7.54f, 13.06f)
                curveTo(7.23f, 12.78f, 7.21f, 12.31f, 7.48f, 12f)
                lineTo(8.98f, 10.33f)
                curveTo(9.19f, 10.1f, 9.52f, 10.02f, 9.81f, 10.13f)
                curveTo(10.1f, 10.24f, 10.29f, 10.52f, 10.29f, 10.83f)
                verticalLineTo(16.18f)
                curveTo(10.29f, 16.59f, 9.96f, 16.92f, 9.54f, 16.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.98f, 5.22f)
                curveTo(13.76f, 5.22f, 13.54f, 5.12f, 13.4f, 4.94f)
                lineTo(11.42f, 2.47f)
                curveTo(11.16f, 2.15f, 11.21f, 1.67f, 11.54f, 1.42f)
                curveTo(11.86f, 1.16f, 12.33f, 1.21f, 12.59f, 1.54f)
                lineTo(14.57f, 4.01f)
                curveTo(14.83f, 4.33f, 14.78f, 4.81f, 14.45f, 5.06f)
                curveTo(14.31f, 5.16f, 14.14f, 5.22f, 13.98f, 5.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 22.75f)
                curveTo(6.689f, 22.75f, 2.359f, 18.43f, 2.359f, 13.11f)
                curveTo(2.359f, 7.79f, 6.679f, 3.47f, 11.999f, 3.47f)
                curveTo(12.689f, 3.47f, 13.389f, 3.55f, 14.149f, 3.73f)
                curveTo(14.549f, 3.82f, 14.809f, 4.23f, 14.709f, 4.63f)
                curveTo(14.619f, 5.03f, 14.209f, 5.29f, 13.809f, 5.19f)
                curveTo(13.169f, 5.04f, 12.569f, 4.97f, 11.999f, 4.97f)
                curveTo(7.509f, 4.97f, 3.859f, 8.62f, 3.859f, 13.11f)
                curveTo(3.859f, 17.6f, 7.509f, 21.25f, 11.999f, 21.25f)
                curveTo(16.489f, 21.25f, 20.139f, 17.6f, 20.139f, 13.11f)
                curveTo(20.139f, 11.37f, 19.569f, 9.69f, 18.489f, 8.25f)
                curveTo(18.239f, 7.92f, 18.309f, 7.45f, 18.639f, 7.2f)
                curveTo(18.969f, 6.95f, 19.439f, 7.02f, 19.689f, 7.35f)
                curveTo(20.969f, 9.05f, 21.639f, 11.04f, 21.639f, 13.11f)
                curveTo(21.639f, 18.43f, 17.309f, 22.75f, 11.999f, 22.75f)
                close()
            }
        }.build()

        return _Forward15Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Forward15Seconds: ImageVector? = null
