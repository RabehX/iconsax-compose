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

val Iconsax.Outline.Money4: ImageVector
    get() {
        if (_Money4 != null) {
            return _Money4!!
        }
        _Money4 = ImageVector.Builder(
            name = "Outline.Money4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7f, 2.75f)
                horizontalLineTo(17f)
                curveTo(20.65f, 2.75f, 22.75f, 4.85f, 22.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17f, 21.25f)
                close()
                moveTo(7f, 4.25f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7f, 19.75f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(21.25f, 5.64f, 19.86f, 4.25f, 17f, 4.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 10.75f)
                curveTo(4.09f, 10.75f, 3.75f, 10.41f, 3.75f, 10f)
                verticalLineTo(8.5f)
                curveTo(3.75f, 6.71f, 5.21f, 5.25f, 7f, 5.25f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 5.25f, 9.25f, 5.59f, 9.25f, 6f)
                curveTo(9.25f, 6.41f, 8.91f, 6.75f, 8.5f, 6.75f)
                horizontalLineTo(7f)
                curveTo(6.04f, 6.75f, 5.25f, 7.54f, 5.25f, 8.5f)
                verticalLineTo(10f)
                curveTo(5.25f, 10.41f, 4.91f, 10.75f, 4.5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 10.75f)
                curveTo(19.09f, 10.75f, 18.75f, 10.41f, 18.75f, 10f)
                verticalLineTo(8.5f)
                curveTo(18.75f, 7.54f, 17.96f, 6.75f, 17f, 6.75f)
                horizontalLineTo(15.5f)
                curveTo(15.09f, 6.75f, 14.75f, 6.41f, 14.75f, 6f)
                curveTo(14.75f, 5.59f, 15.09f, 5.25f, 15.5f, 5.25f)
                horizontalLineTo(17f)
                curveTo(18.79f, 5.25f, 20.25f, 6.71f, 20.25f, 8.5f)
                verticalLineTo(10f)
                curveTo(20.25f, 10.41f, 19.91f, 10.75f, 19.5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 18.75f)
                horizontalLineTo(7f)
                curveTo(5.21f, 18.75f, 3.75f, 17.29f, 3.75f, 15.5f)
                verticalLineTo(14f)
                curveTo(3.75f, 13.59f, 4.09f, 13.25f, 4.5f, 13.25f)
                curveTo(4.91f, 13.25f, 5.25f, 13.59f, 5.25f, 14f)
                verticalLineTo(15.5f)
                curveTo(5.25f, 16.46f, 6.04f, 17.25f, 7f, 17.25f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 17.25f, 9.25f, 17.59f, 9.25f, 18f)
                curveTo(9.25f, 18.41f, 8.91f, 18.75f, 8.5f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 18.75f)
                horizontalLineTo(15.5f)
                curveTo(15.09f, 18.75f, 14.75f, 18.41f, 14.75f, 18f)
                curveTo(14.75f, 17.59f, 15.09f, 17.25f, 15.5f, 17.25f)
                horizontalLineTo(17f)
                curveTo(17.96f, 17.25f, 18.75f, 16.46f, 18.75f, 15.5f)
                verticalLineTo(14f)
                curveTo(18.75f, 13.59f, 19.09f, 13.25f, 19.5f, 13.25f)
                curveTo(19.91f, 13.25f, 20.25f, 13.59f, 20.25f, 14f)
                verticalLineTo(15.5f)
                curveTo(20.25f, 17.29f, 18.79f, 18.75f, 17f, 18.75f)
                close()
            }
        }.build()

        return _Money4!!
    }

@Suppress("ObjectPropertyName")
private var _Money4: ImageVector? = null
