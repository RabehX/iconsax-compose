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

val Iconsax.Outline.TextalignRight: ImageVector
    get() {
        if (_TextalignRight != null) {
            return _TextalignRight!!
        }
        _TextalignRight = ImageVector.Builder(
            name = "Outline.TextalignRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 5.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 5.25f, 2.25f, 4.91f, 2.25f, 4.5f)
                curveTo(2.25f, 4.09f, 2.59f, 3.75f, 3f, 3.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 3.75f, 21.75f, 4.09f, 21.75f, 4.5f)
                curveTo(21.75f, 4.91f, 21.41f, 5.25f, 21f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.999f, 10.25f)
                horizontalLineTo(11.529f)
                curveTo(11.119f, 10.25f, 10.779f, 9.91f, 10.779f, 9.5f)
                curveTo(10.779f, 9.09f, 11.119f, 8.75f, 11.529f, 8.75f)
                horizontalLineTo(20.999f)
                curveTo(21.409f, 8.75f, 21.749f, 9.09f, 21.749f, 9.5f)
                curveTo(21.749f, 9.91f, 21.409f, 10.25f, 20.999f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 15.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 15.25f, 2.25f, 14.91f, 2.25f, 14.5f)
                curveTo(2.25f, 14.09f, 2.59f, 13.75f, 3f, 13.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 13.75f, 21.75f, 14.09f, 21.75f, 14.5f)
                curveTo(21.75f, 14.91f, 21.41f, 15.25f, 21f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.999f, 20.25f)
                horizontalLineTo(11.529f)
                curveTo(11.119f, 20.25f, 10.779f, 19.91f, 10.779f, 19.5f)
                curveTo(10.779f, 19.09f, 11.119f, 18.75f, 11.529f, 18.75f)
                horizontalLineTo(20.999f)
                curveTo(21.409f, 18.75f, 21.749f, 19.09f, 21.749f, 19.5f)
                curveTo(21.749f, 19.91f, 21.409f, 20.25f, 20.999f, 20.25f)
                close()
            }
        }.build()

        return _TextalignRight!!
    }

@Suppress("ObjectPropertyName")
private var _TextalignRight: ImageVector? = null
