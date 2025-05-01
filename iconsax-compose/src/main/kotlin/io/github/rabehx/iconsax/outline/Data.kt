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

val Iconsax.Outline.Data: ImageVector
    get() {
        if (_Data != null) {
            return _Data!!
        }
        _Data = ImageVector.Builder(
            name = "Outline.Data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 14.75f)
                curveTo(18.48f, 14.75f, 17.25f, 13.52f, 17.25f, 12f)
                curveTo(17.25f, 10.48f, 18.48f, 9.25f, 20f, 9.25f)
                curveTo(21.52f, 9.25f, 22.75f, 10.48f, 22.75f, 12f)
                curveTo(22.75f, 13.52f, 21.52f, 14.75f, 20f, 14.75f)
                close()
                moveTo(20f, 10.75f)
                curveTo(19.31f, 10.75f, 18.75f, 11.31f, 18.75f, 12f)
                curveTo(18.75f, 12.69f, 19.31f, 13.25f, 20f, 13.25f)
                curveTo(20.69f, 13.25f, 21.25f, 12.69f, 21.25f, 12f)
                curveTo(21.25f, 11.31f, 20.69f, 10.75f, 20f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 6.75f)
                curveTo(18.48f, 6.75f, 17.25f, 5.52f, 17.25f, 4f)
                curveTo(17.25f, 2.48f, 18.48f, 1.25f, 20f, 1.25f)
                curveTo(21.52f, 1.25f, 22.75f, 2.48f, 22.75f, 4f)
                curveTo(22.75f, 5.52f, 21.52f, 6.75f, 20f, 6.75f)
                close()
                moveTo(20f, 2.75f)
                curveTo(19.31f, 2.75f, 18.75f, 3.31f, 18.75f, 4f)
                curveTo(18.75f, 4.69f, 19.31f, 5.25f, 20f, 5.25f)
                curveTo(20.69f, 5.25f, 21.25f, 4.69f, 21.25f, 4f)
                curveTo(21.25f, 3.31f, 20.69f, 2.75f, 20f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 22.75f)
                curveTo(18.48f, 22.75f, 17.25f, 21.52f, 17.25f, 20f)
                curveTo(17.25f, 18.48f, 18.48f, 17.25f, 20f, 17.25f)
                curveTo(21.52f, 17.25f, 22.75f, 18.48f, 22.75f, 20f)
                curveTo(22.75f, 21.52f, 21.52f, 22.75f, 20f, 22.75f)
                close()
                moveTo(20f, 18.75f)
                curveTo(19.31f, 18.75f, 18.75f, 19.31f, 18.75f, 20f)
                curveTo(18.75f, 20.69f, 19.31f, 21.25f, 20f, 21.25f)
                curveTo(20.69f, 21.25f, 21.25f, 20.69f, 21.25f, 20f)
                curveTo(21.25f, 19.31f, 20.69f, 18.75f, 20f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 14.75f)
                curveTo(2.48f, 14.75f, 1.25f, 13.52f, 1.25f, 12f)
                curveTo(1.25f, 10.48f, 2.48f, 9.25f, 4f, 9.25f)
                curveTo(5.52f, 9.25f, 6.75f, 10.48f, 6.75f, 12f)
                curveTo(6.75f, 13.52f, 5.52f, 14.75f, 4f, 14.75f)
                close()
                moveTo(4f, 10.75f)
                curveTo(3.31f, 10.75f, 2.75f, 11.31f, 2.75f, 12f)
                curveTo(2.75f, 12.69f, 3.31f, 13.25f, 4f, 13.25f)
                curveTo(4.69f, 13.25f, 5.25f, 12.69f, 5.25f, 12f)
                curveTo(5.25f, 11.31f, 4.69f, 10.75f, 4f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 12.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6f, 11.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 20.75f)
                horizontalLineTo(14f)
                curveTo(11.58f, 20.75f, 10.25f, 19.42f, 10.25f, 17f)
                verticalLineTo(7f)
                curveTo(10.25f, 4.58f, 11.58f, 3.25f, 14f, 3.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 3.25f, 18.75f, 3.59f, 18.75f, 4f)
                curveTo(18.75f, 4.41f, 18.41f, 4.75f, 18f, 4.75f)
                horizontalLineTo(14f)
                curveTo(12.42f, 4.75f, 11.75f, 5.42f, 11.75f, 7f)
                verticalLineTo(17f)
                curveTo(11.75f, 18.58f, 12.42f, 19.25f, 14f, 19.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 19.25f, 18.75f, 19.59f, 18.75f, 20f)
                curveTo(18.75f, 20.41f, 18.41f, 20.75f, 18f, 20.75f)
                close()
            }
        }.build()

        return _Data!!
    }

@Suppress("ObjectPropertyName")
private var _Data: ImageVector? = null
