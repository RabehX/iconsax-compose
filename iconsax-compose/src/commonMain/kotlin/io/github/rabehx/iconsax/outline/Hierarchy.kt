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

val Iconsax.Outline.Hierarchy: ImageVector
    get() {
        if (_Hierarchy != null) {
            return _Hierarchy!!
        }
        _Hierarchy = ImageVector.Builder(
            name = "Outline.Hierarchy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 16.75f)
                curveTo(4.59f, 16.75f, 4.25f, 16.41f, 4.25f, 16f)
                verticalLineTo(9f)
                curveTo(4.25f, 8.59f, 4.59f, 8.25f, 5f, 8.25f)
                curveTo(5.41f, 8.25f, 5.75f, 8.59f, 5.75f, 9f)
                verticalLineTo(16f)
                curveTo(5.75f, 16.41f, 5.41f, 16.75f, 5f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.25f, 9.25f)
                curveTo(3.04f, 9.25f, 1.25f, 7.46f, 1.25f, 5.25f)
                curveTo(1.25f, 3.04f, 3.04f, 1.25f, 5.25f, 1.25f)
                curveTo(7.46f, 1.25f, 9.25f, 3.04f, 9.25f, 5.25f)
                curveTo(9.25f, 7.46f, 7.46f, 9.25f, 5.25f, 9.25f)
                close()
                moveTo(5.25f, 2.75f)
                curveTo(3.87f, 2.75f, 2.75f, 3.87f, 2.75f, 5.25f)
                curveTo(2.75f, 6.63f, 3.87f, 7.75f, 5.25f, 7.75f)
                curveTo(6.63f, 7.75f, 7.75f, 6.63f, 7.75f, 5.25f)
                curveTo(7.75f, 3.87f, 6.63f, 2.75f, 5.25f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.75f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19f)
                curveTo(1.25f, 16.93f, 2.93f, 15.25f, 5f, 15.25f)
                curveTo(7.07f, 15.25f, 8.75f, 16.93f, 8.75f, 19f)
                curveTo(8.75f, 21.07f, 7.07f, 22.75f, 5f, 22.75f)
                close()
                moveTo(5f, 16.75f)
                curveTo(3.76f, 16.75f, 2.75f, 17.76f, 2.75f, 19f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5f, 21.25f)
                curveTo(6.24f, 21.25f, 7.25f, 20.24f, 7.25f, 19f)
                curveTo(7.25f, 17.76f, 6.24f, 16.75f, 5f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(16.93f, 22.75f, 15.25f, 21.07f, 15.25f, 19f)
                curveTo(15.25f, 16.93f, 16.93f, 15.25f, 19f, 15.25f)
                curveTo(21.07f, 15.25f, 22.75f, 16.93f, 22.75f, 19f)
                curveTo(22.75f, 21.07f, 21.07f, 22.75f, 19f, 22.75f)
                close()
                moveTo(19f, 16.75f)
                curveTo(17.76f, 16.75f, 16.75f, 17.76f, 16.75f, 19f)
                curveTo(16.75f, 20.24f, 17.76f, 21.25f, 19f, 21.25f)
                curveTo(20.24f, 21.25f, 21.25f, 20.24f, 21.25f, 19f)
                curveTo(21.25f, 17.76f, 20.24f, 16.75f, 19f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.17f, 16.79f)
                curveTo(17.86f, 16.79f, 17.57f, 16.6f, 17.46f, 16.29f)
                curveTo(16.73f, 14.19f, 14.75f, 12.78f, 12.52f, 12.78f)
                curveTo(12.51f, 12.78f, 12.51f, 12.78f, 12.5f, 12.78f)
                lineTo(9.07f, 12.79f)
                curveTo(9.06f, 12.79f, 9.06f, 12.79f, 9.05f, 12.79f)
                curveTo(6.86f, 12.79f, 4.95f, 11.31f, 4.4f, 9.19f)
                curveTo(4.3f, 8.79f, 4.54f, 8.38f, 4.94f, 8.28f)
                curveTo(5.34f, 8.18f, 5.75f, 8.42f, 5.85f, 8.82f)
                curveTo(6.23f, 10.28f, 7.54f, 11.3f, 9.05f, 11.3f)
                horizontalLineTo(9.06f)
                lineTo(12.49f, 11.29f)
                curveTo(12.5f, 11.29f, 12.51f, 11.29f, 12.52f, 11.29f)
                curveTo(15.38f, 11.29f, 17.93f, 13.1f, 18.87f, 15.81f)
                curveTo(19.01f, 16.2f, 18.8f, 16.63f, 18.41f, 16.76f)
                curveTo(18.33f, 16.77f, 18.25f, 16.79f, 18.17f, 16.79f)
                close()
            }
        }.build()

        return _Hierarchy!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy: ImageVector? = null
