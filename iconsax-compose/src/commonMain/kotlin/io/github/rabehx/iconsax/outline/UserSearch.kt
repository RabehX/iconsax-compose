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

val Iconsax.Outline.UserSearch: ImageVector
    get() {
        if (_UserSearch != null) {
            return _UserSearch!!
        }
        _UserSearch = ImageVector.Builder(
            name = "Outline.UserSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.75f)
                curveTo(8.83f, 12.75f, 6.25f, 10.17f, 6.25f, 7f)
                curveTo(6.25f, 3.83f, 8.83f, 1.25f, 12f, 1.25f)
                curveTo(15.17f, 1.25f, 17.75f, 3.83f, 17.75f, 7f)
                curveTo(17.75f, 10.17f, 15.17f, 12.75f, 12f, 12.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.66f, 2.75f, 7.75f, 4.66f, 7.75f, 7f)
                curveTo(7.75f, 9.34f, 9.66f, 11.25f, 12f, 11.25f)
                curveTo(14.34f, 11.25f, 16.25f, 9.34f, 16.25f, 7f)
                curveTo(16.25f, 4.66f, 14.34f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.41f, 22.75f)
                curveTo(3f, 22.75f, 2.66f, 22.41f, 2.66f, 22f)
                curveTo(2.66f, 17.73f, 6.85f, 14.25f, 12f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15f)
                curveTo(12.75f, 15.41f, 12.41f, 15.75f, 12f, 15.75f)
                curveTo(7.68f, 15.75f, 4.16f, 18.55f, 4.16f, 22f)
                curveTo(4.16f, 22.41f, 3.82f, 22.75f, 3.41f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.2f, 22.15f)
                curveTo(16.02f, 22.15f, 14.25f, 20.38f, 14.25f, 18.2f)
                curveTo(14.25f, 16.02f, 16.02f, 14.25f, 18.2f, 14.25f)
                curveTo(20.38f, 14.25f, 22.15f, 16.02f, 22.15f, 18.2f)
                curveTo(22.15f, 20.38f, 20.38f, 22.15f, 18.2f, 22.15f)
                close()
                moveTo(18.2f, 15.75f)
                curveTo(16.85f, 15.75f, 15.75f, 16.85f, 15.75f, 18.2f)
                curveTo(15.75f, 19.55f, 16.85f, 20.65f, 18.2f, 20.65f)
                curveTo(19.55f, 20.65f, 20.65f, 19.55f, 20.65f, 18.2f)
                curveTo(20.65f, 16.85f, 19.55f, 15.75f, 18.2f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                curveTo(21.809f, 22.75f, 21.619f, 22.68f, 21.469f, 22.53f)
                lineTo(20.469f, 21.53f)
                curveTo(20.18f, 21.24f, 20.18f, 20.76f, 20.469f, 20.47f)
                curveTo(20.76f, 20.18f, 21.24f, 20.18f, 21.529f, 20.47f)
                lineTo(22.529f, 21.47f)
                curveTo(22.819f, 21.76f, 22.819f, 22.24f, 22.529f, 22.53f)
                curveTo(22.379f, 22.68f, 22.19f, 22.75f, 22f, 22.75f)
                close()
            }
        }.build()

        return _UserSearch!!
    }

@Suppress("ObjectPropertyName")
private var _UserSearch: ImageVector? = null
