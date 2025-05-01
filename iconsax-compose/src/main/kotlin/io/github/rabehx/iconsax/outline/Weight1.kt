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

val Iconsax.Outline.Weight1: ImageVector
    get() {
        if (_Weight1 != null) {
            return _Weight1!!
        }
        _Weight1 = ImageVector.Builder(
            name = "Outline.Weight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.18f, 18.75f)
                curveTo(15.47f, 18.75f, 13.43f, 18.1f, 13.43f, 15f)
                verticalLineTo(9f)
                curveTo(13.43f, 5.9f, 15.47f, 5.25f, 17.18f, 5.25f)
                curveTo(18.89f, 5.25f, 20.93f, 5.9f, 20.93f, 9f)
                verticalLineTo(15f)
                curveTo(20.93f, 18.1f, 18.89f, 18.75f, 17.18f, 18.75f)
                close()
                moveTo(17.18f, 6.75f)
                curveTo(15.56f, 6.75f, 14.93f, 7.38f, 14.93f, 9f)
                verticalLineTo(15f)
                curveTo(14.93f, 16.62f, 15.56f, 17.25f, 17.18f, 17.25f)
                curveTo(18.8f, 17.25f, 19.43f, 16.62f, 19.43f, 15f)
                verticalLineTo(9f)
                curveTo(19.43f, 7.38f, 18.8f, 6.75f, 17.18f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.82f, 18.75f)
                curveTo(5.11f, 18.75f, 3.07f, 18.1f, 3.07f, 15f)
                verticalLineTo(9f)
                curveTo(3.07f, 5.9f, 5.11f, 5.25f, 6.82f, 5.25f)
                curveTo(8.53f, 5.25f, 10.57f, 5.9f, 10.57f, 9f)
                verticalLineTo(15f)
                curveTo(10.57f, 18.1f, 8.53f, 18.75f, 6.82f, 18.75f)
                close()
                moveTo(6.82f, 6.75f)
                curveTo(5.2f, 6.75f, 4.57f, 7.38f, 4.57f, 9f)
                verticalLineTo(15f)
                curveTo(4.57f, 16.62f, 5.2f, 17.25f, 6.82f, 17.25f)
                curveTo(8.44f, 17.25f, 9.07f, 16.62f, 9.07f, 15f)
                verticalLineTo(9f)
                curveTo(9.07f, 7.38f, 8.44f, 6.75f, 6.82f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.18f, 12.75f)
                horizontalLineTo(9.82f)
                curveTo(9.41f, 12.75f, 9.07f, 12.41f, 9.07f, 12f)
                curveTo(9.07f, 11.59f, 9.41f, 11.25f, 9.82f, 11.25f)
                horizontalLineTo(14.18f)
                curveTo(14.59f, 11.25f, 14.93f, 11.59f, 14.93f, 12f)
                curveTo(14.93f, 12.41f, 14.6f, 12.75f, 14.18f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.5f, 15.25f)
                curveTo(22.09f, 15.25f, 21.75f, 14.91f, 21.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(21.75f, 9.09f, 22.09f, 8.75f, 22.5f, 8.75f)
                curveTo(22.91f, 8.75f, 23.25f, 9.09f, 23.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(23.25f, 14.91f, 22.91f, 15.25f, 22.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.5f, 15.25f)
                curveTo(1.09f, 15.25f, 0.75f, 14.91f, 0.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(0.75f, 9.09f, 1.09f, 8.75f, 1.5f, 8.75f)
                curveTo(1.91f, 8.75f, 2.25f, 9.09f, 2.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(2.25f, 14.91f, 1.91f, 15.25f, 1.5f, 15.25f)
                close()
            }
        }.build()

        return _Weight1!!
    }

@Suppress("ObjectPropertyName")
private var _Weight1: ImageVector? = null
