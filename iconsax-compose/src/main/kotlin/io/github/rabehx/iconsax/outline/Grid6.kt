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

val Iconsax.Outline.Grid6: ImageVector
    get() {
        if (_Grid6 != null) {
            return _Grid6!!
        }
        _Grid6 = ImageVector.Builder(
            name = "Outline.Grid6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.75f)
                curveTo(9.59f, 22.75f, 9.25f, 22.41f, 9.25f, 22f)
                verticalLineTo(2f)
                curveTo(9.25f, 1.59f, 9.59f, 1.25f, 10f, 1.25f)
                curveTo(10.41f, 1.25f, 10.75f, 1.59f, 10.75f, 2f)
                verticalLineTo(22f)
                curveTo(10.75f, 22.41f, 10.41f, 22.75f, 10f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 9.25f, 9.25f, 8.91f, 9.25f, 8.5f)
                curveTo(9.25f, 8.09f, 9.59f, 7.75f, 10f, 7.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 7.75f, 22.75f, 8.09f, 22.75f, 8.5f)
                curveTo(22.75f, 8.91f, 22.41f, 9.25f, 22f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 16.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 16.25f, 9.25f, 15.91f, 9.25f, 15.5f)
                curveTo(9.25f, 15.09f, 9.59f, 14.75f, 10f, 14.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 14.75f, 22.75f, 15.09f, 22.75f, 15.5f)
                curveTo(22.75f, 15.91f, 22.41f, 16.25f, 22f, 16.25f)
                close()
            }
        }.build()

        return _Grid6!!
    }

@Suppress("ObjectPropertyName")
private var _Grid6: ImageVector? = null
