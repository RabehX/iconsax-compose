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

val Iconsax.Outline.TextBold: ImageVector
    get() {
        if (_TextBold != null) {
            return _TextBold!!
        }
        _TextBold = ImageVector.Builder(
            name = "Outline.TextBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 12.75f)
                horizontalLineTo(4.881f)
                curveTo(4.471f, 12.75f, 4.131f, 12.41f, 4.131f, 12f)
                verticalLineTo(4.5f)
                curveTo(4.131f, 2.98f, 5.361f, 1.75f, 6.881f, 1.75f)
                horizontalLineTo(12.001f)
                curveTo(15.031f, 1.75f, 17.501f, 4.22f, 17.501f, 7.25f)
                curveTo(17.501f, 10.28f, 15.031f, 12.75f, 12.001f, 12.75f)
                close()
                moveTo(5.621f, 11.25f)
                horizontalLineTo(12.001f)
                curveTo(14.211f, 11.25f, 16.001f, 9.46f, 16.001f, 7.25f)
                curveTo(16.001f, 5.04f, 14.211f, 3.25f, 12.001f, 3.25f)
                horizontalLineTo(6.881f)
                curveTo(6.191f, 3.25f, 5.631f, 3.81f, 5.631f, 4.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(5.621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.381f, 22.25f)
                horizontalLineTo(6.881f)
                curveTo(5.361f, 22.25f, 4.131f, 21.02f, 4.131f, 19.5f)
                verticalLineTo(12f)
                curveTo(4.131f, 11.59f, 4.471f, 11.25f, 4.881f, 11.25f)
                horizontalLineTo(14.381f)
                curveTo(17.411f, 11.25f, 19.881f, 13.72f, 19.881f, 16.75f)
                curveTo(19.881f, 19.78f, 17.411f, 22.25f, 14.381f, 22.25f)
                close()
                moveTo(5.621f, 12.75f)
                verticalLineTo(19.5f)
                curveTo(5.621f, 20.19f, 6.181f, 20.75f, 6.871f, 20.75f)
                horizontalLineTo(14.371f)
                curveTo(16.581f, 20.75f, 18.371f, 18.96f, 18.371f, 16.75f)
                curveTo(18.371f, 14.54f, 16.581f, 12.75f, 14.371f, 12.75f)
                horizontalLineTo(5.621f)
                close()
            }
        }.build()

        return _TextBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBold: ImageVector? = null
