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


val Iconsax.Filled.SearchStatus: ImageVector
    get() {
        if (_SearchStatus != null) {
            return _SearchStatus!!
        }
        _SearchStatus = ImageVector.Builder(
            name = "Filled.SearchStatus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 2f)
                curveTo(6.26f, 2f, 2f, 6.26f, 2f, 11.5f)
                curveTo(2f, 16.74f, 6.26f, 21f, 11.5f, 21f)
                curveTo(16.74f, 21f, 21f, 16.74f, 21f, 11.5f)
                curveTo(21f, 6.26f, 16.74f, 2f, 11.5f, 2f)
                close()
                moveTo(11.5f, 13.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 13.75f, 7.75f, 13.41f, 7.75f, 13f)
                curveTo(7.75f, 12.59f, 8.09f, 12.25f, 8.5f, 12.25f)
                horizontalLineTo(11.5f)
                curveTo(11.91f, 12.25f, 12.25f, 12.59f, 12.25f, 13f)
                curveTo(12.25f, 13.41f, 11.91f, 13.75f, 11.5f, 13.75f)
                close()
                moveTo(14.5f, 10.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 10.75f, 7.75f, 10.41f, 7.75f, 10f)
                curveTo(7.75f, 9.59f, 8.09f, 9.25f, 8.5f, 9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 9.25f, 15.25f, 9.59f, 15.25f, 10f)
                curveTo(15.25f, 10.41f, 14.91f, 10.75f, 14.5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.301f, 21.999f)
                curveTo(21.121f, 21.999f, 20.941f, 21.929f, 20.81f, 21.799f)
                lineTo(18.951f, 19.939f)
                curveTo(18.681f, 19.669f, 18.681f, 19.229f, 18.951f, 18.949f)
                curveTo(19.221f, 18.679f, 19.66f, 18.679f, 19.941f, 18.949f)
                lineTo(21.801f, 20.809f)
                curveTo(22.07f, 21.079f, 22.07f, 21.519f, 21.801f, 21.799f)
                curveTo(21.66f, 21.929f, 21.48f, 21.999f, 21.301f, 21.999f)
                close()
            }
        }.build()

        return _SearchStatus!!
    }

@Suppress("ObjectPropertyName")
private var _SearchStatus: ImageVector? = null
