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

val Iconsax.Outline.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Outline.Wind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 22.75f)
                curveTo(16.16f, 22.75f, 14.25f, 20.84f, 14.25f, 18.5f)
                verticalLineTo(18f)
                curveTo(14.25f, 17.59f, 14.59f, 17.25f, 15f, 17.25f)
                curveTo(15.41f, 17.25f, 15.75f, 17.59f, 15.75f, 18f)
                verticalLineTo(18.5f)
                curveTo(15.75f, 20.02f, 16.98f, 21.25f, 18.5f, 21.25f)
                curveTo(20.02f, 21.25f, 21.25f, 20.02f, 21.25f, 18.5f)
                curveTo(21.25f, 16.98f, 20.02f, 15.75f, 18.5f, 15.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 15.75f, 1.25f, 15.41f, 1.25f, 15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                horizontalLineTo(18.5f)
                curveTo(20.84f, 14.25f, 22.75f, 16.16f, 22.75f, 18.5f)
                curveTo(22.75f, 20.84f, 20.84f, 22.75f, 18.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(18.5f)
                curveTo(20.02f, 11.25f, 21.25f, 10.02f, 21.25f, 8.5f)
                curveTo(21.25f, 6.98f, 20.02f, 5.75f, 18.5f, 5.75f)
                curveTo(16.98f, 5.75f, 15.75f, 6.98f, 15.75f, 8.5f)
                verticalLineTo(9f)
                curveTo(15.75f, 9.41f, 15.41f, 9.75f, 15f, 9.75f)
                curveTo(14.59f, 9.75f, 14.25f, 9.41f, 14.25f, 9f)
                verticalLineTo(8.5f)
                curveTo(14.25f, 6.16f, 16.16f, 4.25f, 18.5f, 4.25f)
                curveTo(20.84f, 4.25f, 22.75f, 6.16f, 22.75f, 8.5f)
                curveTo(22.75f, 10.84f, 20.84f, 12.75f, 18.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.31f, 9.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                curveTo(1.25f, 8.59f, 1.59f, 8.25f, 2f, 8.25f)
                horizontalLineTo(9.31f)
                curveTo(10.38f, 8.25f, 11.25f, 7.38f, 11.25f, 6.31f)
                curveTo(11.25f, 5.24f, 10.38f, 4.37f, 9.31f, 4.37f)
                curveTo(8.24f, 4.37f, 7.37f, 5.24f, 7.37f, 6.31f)
                verticalLineTo(6.69f)
                curveTo(7.37f, 7.1f, 7.03f, 7.44f, 6.62f, 7.44f)
                curveTo(6.21f, 7.44f, 5.87f, 7.1f, 5.87f, 6.69f)
                verticalLineTo(6.31f)
                curveTo(5.87f, 4.41f, 7.41f, 2.87f, 9.31f, 2.87f)
                curveTo(11.21f, 2.87f, 12.75f, 4.41f, 12.75f, 6.31f)
                curveTo(12.75f, 8.21f, 11.21f, 9.75f, 9.31f, 9.75f)
                close()
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
