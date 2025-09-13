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

val Iconsax.Outline.SearchStatus1: ImageVector
    get() {
        if (_SearchStatus1 != null) {
            return _SearchStatus1!!
        }
        _SearchStatus1 = ImageVector.Builder(
            name = "Outline.SearchStatus1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 5.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 5.75f, 13.25f, 5.41f, 13.25f, 5f)
                curveTo(13.25f, 4.59f, 13.59f, 4.25f, 14f, 4.25f)
                horizontalLineTo(20f)
                curveTo(20.41f, 4.25f, 20.75f, 4.59f, 20.75f, 5f)
                curveTo(20.75f, 5.41f, 20.41f, 5.75f, 20f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 8.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 8.75f, 13.25f, 8.41f, 13.25f, 8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 21.75f)
                curveTo(5.85f, 21.75f, 1.25f, 17.15f, 1.25f, 11.5f)
                curveTo(1.25f, 5.85f, 5.85f, 1.25f, 11.5f, 1.25f)
                curveTo(11.91f, 1.25f, 12.25f, 1.59f, 12.25f, 2f)
                curveTo(12.25f, 2.41f, 11.91f, 2.75f, 11.5f, 2.75f)
                curveTo(6.67f, 2.75f, 2.75f, 6.68f, 2.75f, 11.5f)
                curveTo(2.75f, 16.32f, 6.67f, 20.25f, 11.5f, 20.25f)
                curveTo(16.33f, 20.25f, 20.25f, 16.32f, 20.25f, 11.5f)
                curveTo(20.25f, 11.09f, 20.59f, 10.75f, 21f, 10.75f)
                curveTo(21.41f, 10.75f, 21.75f, 11.09f, 21.75f, 11.5f)
                curveTo(21.75f, 17.15f, 17.15f, 21.75f, 11.5f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                curveTo(21.81f, 22.75f, 21.62f, 22.68f, 21.47f, 22.53f)
                lineTo(19.47f, 20.53f)
                curveTo(19.18f, 20.24f, 19.18f, 19.76f, 19.47f, 19.47f)
                curveTo(19.76f, 19.18f, 20.24f, 19.18f, 20.53f, 19.47f)
                lineTo(22.53f, 21.47f)
                curveTo(22.82f, 21.76f, 22.82f, 22.24f, 22.53f, 22.53f)
                curveTo(22.38f, 22.68f, 22.19f, 22.75f, 22f, 22.75f)
                close()
            }
        }.build()

        return _SearchStatus1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchStatus1: ImageVector? = null
