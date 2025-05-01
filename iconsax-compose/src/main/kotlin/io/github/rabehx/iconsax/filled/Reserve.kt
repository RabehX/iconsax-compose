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


val Iconsax.Filled.Reserve: ImageVector
    get() {
        if (_Reserve != null) {
            return _Reserve!!
        }
        _Reserve = ImageVector.Builder(
            name = "Filled.Reserve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.971f, 18f)
                verticalLineTo(19f)
                curveTo(21.971f, 20.65f, 21.971f, 22f, 18.971f, 22f)
                horizontalLineTo(4.971f)
                curveTo(1.971f, 22f, 1.971f, 20.65f, 1.971f, 19f)
                verticalLineTo(18f)
                curveTo(1.971f, 17.45f, 2.421f, 17f, 2.971f, 17f)
                horizontalLineTo(20.971f)
                curveTo(21.521f, 17f, 21.971f, 17.45f, 21.971f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.41f, 5.18f)
                curveTo(14.46f, 4.98f, 14.49f, 4.79f, 14.5f, 4.58f)
                curveTo(14.53f, 3.42f, 13.819f, 2.4f, 12.7f, 2.1f)
                curveTo(11.019f, 1.64f, 9.5f, 2.9f, 9.5f, 4.5f)
                curveTo(9.5f, 4.74f, 9.53f, 4.96f, 9.59f, 5.18f)
                curveTo(5.98f, 5.95f, 3.27f, 9.16f, 3.27f, 13f)
                verticalLineTo(14.5f)
                curveTo(3.27f, 15.05f, 3.72f, 15.5f, 4.27f, 15.5f)
                horizontalLineTo(19.719f)
                curveTo(20.27f, 15.5f, 20.719f, 15.05f, 20.719f, 14.5f)
                verticalLineTo(13f)
                curveTo(20.719f, 9.16f, 18.02f, 5.96f, 14.41f, 5.18f)
                close()
                moveTo(15f, 11.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 11.75f, 8.25f, 11.41f, 8.25f, 11f)
                curveTo(8.25f, 10.59f, 8.59f, 10.25f, 9f, 10.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 10.25f, 15.75f, 10.59f, 15.75f, 11f)
                curveTo(15.75f, 11.41f, 15.41f, 11.75f, 15f, 11.75f)
                close()
            }
        }.build()

        return _Reserve!!
    }

@Suppress("ObjectPropertyName")
private var _Reserve: ImageVector? = null
