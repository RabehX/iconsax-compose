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


val Iconsax.Filled.Forbidden2: ImageVector
    get() {
        if (_Forbidden2 != null) {
            return _Forbidden2!!
        }
        _Forbidden2 = ImageVector.Builder(
            name = "Filled.Forbidden2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.12f, 6.98f)
                lineTo(17.02f, 2.88f)
                curveTo(16.54f, 2.4f, 15.58f, 2f, 14.9f, 2f)
                horizontalLineTo(9.1f)
                curveTo(8.42f, 2f, 7.46f, 2.4f, 6.98f, 2.88f)
                lineTo(2.88f, 6.98f)
                curveTo(2.4f, 7.46f, 2f, 8.42f, 2f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2f, 15.58f, 2.4f, 16.54f, 2.88f, 17.02f)
                lineTo(6.98f, 21.12f)
                curveTo(7.46f, 21.6f, 8.42f, 22f, 9.1f, 22f)
                horizontalLineTo(14.9f)
                curveTo(15.58f, 22f, 16.54f, 21.6f, 17.02f, 21.12f)
                lineTo(21.12f, 17.02f)
                curveTo(21.6f, 16.54f, 22f, 15.58f, 22f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(22f, 8.42f, 21.6f, 7.46f, 21.12f, 6.98f)
                close()
                moveTo(16.03f, 14.97f)
                curveTo(16.32f, 15.26f, 16.32f, 15.74f, 16.03f, 16.03f)
                curveTo(15.88f, 16.18f, 15.69f, 16.25f, 15.5f, 16.25f)
                curveTo(15.31f, 16.25f, 15.12f, 16.18f, 14.97f, 16.03f)
                lineTo(12f, 13.06f)
                lineTo(9.03f, 16.03f)
                curveTo(8.88f, 16.18f, 8.69f, 16.25f, 8.5f, 16.25f)
                curveTo(8.31f, 16.25f, 8.12f, 16.18f, 7.97f, 16.03f)
                curveTo(7.68f, 15.74f, 7.68f, 15.26f, 7.97f, 14.97f)
                lineTo(10.94f, 12f)
                lineTo(7.97f, 9.03f)
                curveTo(7.68f, 8.74f, 7.68f, 8.26f, 7.97f, 7.97f)
                curveTo(8.26f, 7.68f, 8.74f, 7.68f, 9.03f, 7.97f)
                lineTo(12f, 10.94f)
                lineTo(14.97f, 7.97f)
                curveTo(15.26f, 7.68f, 15.74f, 7.68f, 16.03f, 7.97f)
                curveTo(16.32f, 8.26f, 16.32f, 8.74f, 16.03f, 9.03f)
                lineTo(13.06f, 12f)
                lineTo(16.03f, 14.97f)
                close()
            }
        }.build()

        return _Forbidden2!!
    }

@Suppress("ObjectPropertyName")
private var _Forbidden2: ImageVector? = null
