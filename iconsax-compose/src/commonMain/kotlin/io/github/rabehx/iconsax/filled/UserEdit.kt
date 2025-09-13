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


val Iconsax.Filled.UserEdit: ImageVector
    get() {
        if (_UserEdit != null) {
            return _UserEdit!!
        }
        _UserEdit = ImageVector.Builder(
            name = "Filled.UserEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(9.24f, 2f, 7f, 4.24f, 7f, 7f)
                curveTo(7f, 9.76f, 9.24f, 12f, 12f, 12f)
                curveTo(14.76f, 12f, 17f, 9.76f, 17f, 7f)
                curveTo(17f, 4.24f, 14.76f, 2f, 12f, 2f)
                close()
                moveTo(14.17f, 6.51f)
                lineTo(11.47f, 9.21f)
                curveTo(11.37f, 9.31f, 11.16f, 9.41f, 11.02f, 9.44f)
                lineTo(9.99f, 9.58f)
                curveTo(9.61f, 9.63f, 9.35f, 9.37f, 9.41f, 9f)
                lineTo(9.56f, 7.97f)
                curveTo(9.58f, 7.83f, 9.68f, 7.62f, 9.79f, 7.52f)
                lineTo(12.49f, 4.82f)
                curveTo(12.95f, 4.36f, 13.5f, 4.14f, 14.18f, 4.82f)
                curveTo(14.85f, 5.51f, 14.63f, 6.05f, 14.17f, 6.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(6.99f, 14f, 2.91f, 17.36f, 2.91f, 21.5f)
                curveTo(2.91f, 21.78f, 3.13f, 22f, 3.41f, 22f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 22f, 21.09f, 21.78f, 21.09f, 21.5f)
                curveTo(21.09f, 17.36f, 17.01f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _UserEdit!!
    }

@Suppress("ObjectPropertyName")
private var _UserEdit: ImageVector? = null
