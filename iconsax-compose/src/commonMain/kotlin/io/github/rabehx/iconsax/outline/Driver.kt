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

val Iconsax.Outline.Driver: ImageVector
    get() {
        if (_Driver != null) {
            return _Driver!!
        }
        _Driver = ImageVector.Builder(
            name = "Outline.Driver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.32f, 10.75f)
                horizontalLineTo(4.69f)
                curveTo(2.8f, 10.75f, 1.26f, 9.21f, 1.26f, 7.32f)
                verticalLineTo(4.69f)
                curveTo(1.26f, 2.8f, 2.8f, 1.26f, 4.69f, 1.26f)
                horizontalLineTo(19.32f)
                curveTo(21.21f, 1.26f, 22.75f, 2.8f, 22.75f, 4.69f)
                verticalLineTo(7.32f)
                curveTo(22.75f, 9.21f, 21.21f, 10.75f, 19.32f, 10.75f)
                close()
                moveTo(4.68f, 2.75f)
                curveTo(3.61f, 2.75f, 2.75f, 3.62f, 2.75f, 4.68f)
                verticalLineTo(7.31f)
                curveTo(2.75f, 8.38f, 3.62f, 9.24f, 4.68f, 9.24f)
                horizontalLineTo(19.31f)
                curveTo(20.38f, 9.24f, 21.24f, 8.37f, 21.24f, 7.31f)
                verticalLineTo(4.68f)
                curveTo(21.24f, 3.61f, 20.37f, 2.75f, 19.31f, 2.75f)
                horizontalLineTo(4.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.32f, 22.75f)
                horizontalLineTo(4.69f)
                curveTo(2.8f, 22.75f, 1.26f, 21.21f, 1.26f, 19.32f)
                verticalLineTo(16.69f)
                curveTo(1.26f, 14.8f, 2.8f, 13.26f, 4.69f, 13.26f)
                horizontalLineTo(19.32f)
                curveTo(21.21f, 13.26f, 22.75f, 14.8f, 22.75f, 16.69f)
                verticalLineTo(19.32f)
                curveTo(22.75f, 21.21f, 21.21f, 22.75f, 19.32f, 22.75f)
                close()
                moveTo(4.68f, 14.75f)
                curveTo(3.61f, 14.75f, 2.75f, 15.62f, 2.75f, 16.68f)
                verticalLineTo(19.31f)
                curveTo(2.75f, 20.38f, 3.62f, 21.24f, 4.68f, 21.24f)
                horizontalLineTo(19.31f)
                curveTo(20.38f, 21.24f, 21.24f, 20.37f, 21.24f, 19.31f)
                verticalLineTo(16.68f)
                curveTo(21.24f, 15.61f, 20.37f, 14.75f, 19.31f, 14.75f)
                horizontalLineTo(4.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 7.75f)
                curveTo(5.59f, 7.75f, 5.25f, 7.41f, 5.25f, 7f)
                verticalLineTo(5f)
                curveTo(5.25f, 4.59f, 5.59f, 4.25f, 6f, 4.25f)
                curveTo(6.41f, 4.25f, 6.75f, 4.59f, 6.75f, 5f)
                verticalLineTo(7f)
                curveTo(6.75f, 7.41f, 6.41f, 7.75f, 6f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 7.75f)
                curveTo(9.59f, 7.75f, 9.25f, 7.41f, 9.25f, 7f)
                verticalLineTo(5f)
                curveTo(9.25f, 4.59f, 9.59f, 4.25f, 10f, 4.25f)
                curveTo(10.41f, 4.25f, 10.75f, 4.59f, 10.75f, 5f)
                verticalLineTo(7f)
                curveTo(10.75f, 7.41f, 10.41f, 7.75f, 10f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 19.75f)
                curveTo(5.59f, 19.75f, 5.25f, 19.41f, 5.25f, 19f)
                verticalLineTo(17f)
                curveTo(5.25f, 16.59f, 5.59f, 16.25f, 6f, 16.25f)
                curveTo(6.41f, 16.25f, 6.75f, 16.59f, 6.75f, 17f)
                verticalLineTo(19f)
                curveTo(6.75f, 19.41f, 6.41f, 19.75f, 6f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 19.75f)
                curveTo(9.59f, 19.75f, 9.25f, 19.41f, 9.25f, 19f)
                verticalLineTo(17f)
                curveTo(9.25f, 16.59f, 9.59f, 16.25f, 10f, 16.25f)
                curveTo(10.41f, 16.25f, 10.75f, 16.59f, 10.75f, 17f)
                verticalLineTo(19f)
                curveTo(10.75f, 19.41f, 10.41f, 19.75f, 10f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 6.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 6.75f, 13.25f, 6.41f, 13.25f, 6f)
                curveTo(13.25f, 5.59f, 13.59f, 5.25f, 14f, 5.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 5.25f, 18.75f, 5.59f, 18.75f, 6f)
                curveTo(18.75f, 6.41f, 18.41f, 6.75f, 18f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 18.75f, 13.25f, 18.41f, 13.25f, 18f)
                curveTo(13.25f, 17.59f, 13.59f, 17.25f, 14f, 17.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 17.25f, 18.75f, 17.59f, 18.75f, 18f)
                curveTo(18.75f, 18.41f, 18.41f, 18.75f, 18f, 18.75f)
                close()
            }
        }.build()

        return _Driver!!
    }

@Suppress("ObjectPropertyName")
private var _Driver: ImageVector? = null
