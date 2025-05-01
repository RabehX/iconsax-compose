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


val Iconsax.Filled.VideoVertical: ImageVector
    get() {
        if (_VideoVertical != null) {
            return _VideoVertical!!
        }
        _VideoVertical = ImageVector.Builder(
            name = "Filled.VideoVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.36f, 7.781f)
                horizontalLineTo(2f)
                verticalLineTo(11.251f)
                horizontalLineTo(6.36f)
                verticalLineTo(7.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.358f, 6.289f)
                verticalLineTo(2.129f)
                curveTo(4.078f, 2.549f, 2.588f, 4.019f, 2.148f, 6.279f)
                horizontalLineTo(6.328f)
                curveTo(6.338f, 6.279f, 6.348f, 6.289f, 6.358f, 6.289f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.36f, 16.31f)
                verticalLineTo(12.75f)
                horizontalLineTo(2f)
                verticalLineTo(16.28f)
                horizontalLineTo(6.24f)
                curveTo(6.28f, 16.28f, 6.32f, 16.3f, 6.36f, 16.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.849f, 6.28f)
                curveTo(21.419f, 4.09f, 20.019f, 2.65f, 17.859f, 2.18f)
                verticalLineTo(6.28f)
                horizontalLineTo(21.849f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.359f, 11.25f)
                verticalLineTo(2.01f)
                curveTo(16.309f, 2f, 16.249f, 2f, 16.189f, 2f)
                horizontalLineTo(7.859f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.359f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.999f, 12.75f)
                horizontalLineTo(17.859f)
                verticalLineTo(16.28f)
                horizontalLineTo(21.999f)
                verticalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.859f, 21.821f)
                curveTo(19.999f, 21.351f, 21.399f, 19.931f, 21.839f, 17.781f)
                horizontalLineTo(17.859f)
                verticalLineTo(21.821f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.24f, 17.782f)
                horizontalLineTo(2.16f)
                curveTo(2.62f, 20.002f, 4.1f, 21.452f, 6.36f, 21.872f)
                verticalLineTo(17.762f)
                curveTo(6.32f, 17.772f, 6.28f, 17.782f, 6.24f, 17.782f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.999f, 7.781f)
                horizontalLineTo(17.859f)
                verticalLineTo(11.251f)
                horizontalLineTo(21.999f)
                verticalLineTo(7.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.859f, 12.75f)
                verticalLineTo(22f)
                horizontalLineTo(16.189f)
                curveTo(16.249f, 22f, 16.309f, 22f, 16.359f, 21.99f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.859f)
                close()
            }
        }.build()

        return _VideoVertical!!
    }

@Suppress("ObjectPropertyName")
private var _VideoVertical: ImageVector? = null
