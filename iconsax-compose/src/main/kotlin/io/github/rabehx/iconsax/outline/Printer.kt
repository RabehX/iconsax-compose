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

val Iconsax.Outline.Printer: ImageVector
    get() {
        if (_Printer != null) {
            return _Printer!!
        }
        _Printer = ImageVector.Builder(
            name = "Outline.Printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 7.75f)
                horizontalLineTo(7.25f)
                curveTo(6.84f, 7.75f, 6.5f, 7.41f, 6.5f, 7f)
                verticalLineTo(5f)
                curveTo(6.5f, 2.44f, 7.69f, 1.25f, 10.25f, 1.25f)
                horizontalLineTo(13.75f)
                curveTo(16.31f, 1.25f, 17.5f, 2.44f, 17.5f, 5f)
                verticalLineTo(7f)
                curveTo(17.5f, 7.41f, 17.16f, 7.75f, 16.75f, 7.75f)
                close()
                moveTo(8f, 6.25f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                curveTo(16f, 3.3f, 15.45f, 2.75f, 13.75f, 2.75f)
                horizontalLineTo(10.25f)
                curveTo(8.55f, 2.75f, 8f, 3.3f, 8f, 5f)
                verticalLineTo(6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(11f)
                curveTo(8.58f, 22.75f, 7.25f, 21.42f, 7.25f, 19f)
                verticalLineTo(15f)
                curveTo(7.25f, 14.59f, 7.59f, 14.25f, 8f, 14.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 14.25f, 16.75f, 14.59f, 16.75f, 15f)
                verticalLineTo(19f)
                curveTo(16.75f, 21.42f, 15.42f, 22.75f, 13f, 22.75f)
                close()
                moveTo(8.75f, 15.75f)
                verticalLineTo(19f)
                curveTo(8.75f, 20.58f, 9.42f, 21.25f, 11f, 21.25f)
                horizontalLineTo(13f)
                curveTo(14.58f, 21.25f, 15.25f, 20.58f, 15.25f, 19f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 18.75f, 15.25f, 18.41f, 15.25f, 18f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(18f)
                curveTo(8.75f, 18.41f, 8.41f, 18.75f, 8f, 18.75f)
                horizontalLineTo(6f)
                curveTo(3.58f, 18.75f, 2.25f, 17.42f, 2.25f, 15f)
                verticalLineTo(10f)
                curveTo(2.25f, 7.58f, 3.58f, 6.25f, 6f, 6.25f)
                horizontalLineTo(18f)
                curveTo(20.42f, 6.25f, 21.75f, 7.58f, 21.75f, 10f)
                verticalLineTo(15f)
                curveTo(21.75f, 17.42f, 20.42f, 18.75f, 18f, 18.75f)
                close()
                moveTo(16.75f, 17.25f)
                horizontalLineTo(18f)
                curveTo(19.58f, 17.25f, 20.25f, 16.58f, 20.25f, 15f)
                verticalLineTo(10f)
                curveTo(20.25f, 8.42f, 19.58f, 7.75f, 18f, 7.75f)
                horizontalLineTo(6f)
                curveTo(4.42f, 7.75f, 3.75f, 8.42f, 3.75f, 10f)
                verticalLineTo(15f)
                curveTo(3.75f, 16.58f, 4.42f, 17.25f, 6f, 17.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(15f)
                curveTo(7.25f, 14.59f, 7.59f, 14.25f, 8f, 14.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 14.25f, 16.75f, 14.59f, 16.75f, 15f)
                verticalLineTo(17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 11.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7f, 10.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 10.25f, 10.75f, 10.59f, 10.75f, 11f)
                curveTo(10.75f, 11.41f, 10.41f, 11.75f, 10f, 11.75f)
                close()
            }
        }.build()

        return _Printer!!
    }

@Suppress("ObjectPropertyName")
private var _Printer: ImageVector? = null
