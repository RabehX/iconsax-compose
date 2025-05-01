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


val Iconsax.Filled.Printer: ImageVector
    get() {
        if (_Printer != null) {
            return _Printer!!
        }
        _Printer = ImageVector.Builder(
            name = "Filled.Printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 5f)
                curveTo(7f, 3.34f, 8.34f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.66f, 2f, 17f, 3.34f, 17f, 5f)
                curveTo(17f, 5.55f, 16.55f, 6f, 16f, 6f)
                horizontalLineTo(8f)
                curveTo(7.45f, 6f, 7f, 5.55f, 7f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.75f, 15f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17f, 15.75f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                curveTo(16f, 20.66f, 14.66f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(9.34f, 22f, 8f, 20.66f, 8f, 19f)
                verticalLineTo(15.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                curveTo(4f, 7f, 3f, 8f, 3f, 10f)
                verticalLineTo(15f)
                curveTo(3f, 17f, 4f, 18f, 6f, 18f)
                horizontalLineTo(6.375f)
                curveTo(6.72f, 18f, 7f, 17.72f, 7f, 17.375f)
                curveTo(7f, 17.03f, 6.711f, 16.76f, 6.388f, 16.638f)
                curveTo(5.726f, 16.388f, 5.25f, 15.745f, 5.25f, 15f)
                curveTo(5.25f, 14.04f, 6.04f, 13.25f, 7f, 13.25f)
                horizontalLineTo(17f)
                curveTo(17.96f, 13.25f, 18.75f, 14.04f, 18.75f, 15f)
                curveTo(18.75f, 15.745f, 18.274f, 16.388f, 17.612f, 16.638f)
                curveTo(17.289f, 16.76f, 17f, 17.03f, 17f, 17.375f)
                curveTo(17f, 17.72f, 17.28f, 18f, 17.625f, 18f)
                horizontalLineTo(18f)
                curveTo(20f, 18f, 21f, 17f, 21f, 15f)
                verticalLineTo(10f)
                curveTo(21f, 8f, 20f, 7f, 18f, 7f)
                close()
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
