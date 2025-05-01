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

val Iconsax.Outline.Frame3: ImageVector
    get() {
        if (_Frame3 != null) {
            return _Frame3!!
        }
        _Frame3 = ImageVector.Builder(
            name = "Outline.Frame3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.26f, 19.65f)
                curveTo(18.85f, 19.65f, 18.51f, 19.31f, 18.51f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(18.51f, 6.09f, 18.3f, 5.75f, 17.03f, 5.75f)
                horizontalLineTo(15.99f)
                curveTo(14.72f, 5.75f, 14.51f, 6.09f, 14.51f, 7.1f)
                verticalLineTo(18.9f)
                curveTo(14.51f, 19.31f, 14.17f, 19.65f, 13.76f, 19.65f)
                curveTo(13.35f, 19.65f, 13.01f, 19.31f, 13.01f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(13.01f, 5.18f, 13.99f, 4.25f, 15.99f, 4.25f)
                horizontalLineTo(17.03f)
                curveTo(19.04f, 4.25f, 20.01f, 5.18f, 20.01f, 7.1f)
                verticalLineTo(18.9f)
                curveTo(20.01f, 19.31f, 19.67f, 19.65f, 19.26f, 19.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.76f, 19.65f)
                curveTo(10.35f, 19.65f, 10.01f, 19.31f, 10.01f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(10.01f, 11.09f, 9.8f, 10.75f, 8.53f, 10.75f)
                horizontalLineTo(7.49f)
                curveTo(6.22f, 10.75f, 6.01f, 11.09f, 6.01f, 12.1f)
                verticalLineTo(18.9f)
                curveTo(6.01f, 19.31f, 5.67f, 19.65f, 5.26f, 19.65f)
                curveTo(4.85f, 19.65f, 4.51f, 19.31f, 4.51f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(4.51f, 10.18f, 5.49f, 9.25f, 7.49f, 9.25f)
                horizontalLineTo(8.53f)
                curveTo(10.54f, 9.25f, 11.51f, 10.18f, 11.51f, 12.1f)
                verticalLineTo(18.9f)
                curveTo(11.51f, 19.31f, 11.17f, 19.65f, 10.76f, 19.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 19.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 19.75f, 1.25f, 19.41f, 1.25f, 19f)
                curveTo(1.25f, 18.59f, 1.58f, 18.25f, 2f, 18.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 18.25f, 22.75f, 18.59f, 22.75f, 19f)
                curveTo(22.75f, 19.41f, 22.42f, 19.75f, 22f, 19.75f)
                close()
            }
        }.build()

        return _Frame3!!
    }

@Suppress("ObjectPropertyName")
private var _Frame3: ImageVector? = null
