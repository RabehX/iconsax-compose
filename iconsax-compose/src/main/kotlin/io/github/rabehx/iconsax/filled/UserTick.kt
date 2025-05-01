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


val Iconsax.Filled.UserTick: ImageVector
    get() {
        if (_UserTick != null) {
            return _UserTick!!
        }
        _UserTick = ImageVector.Builder(
            name = "Filled.UserTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(6.99f, 14f, 2.91f, 17.36f, 2.91f, 21.5f)
                curveTo(2.91f, 21.78f, 3.13f, 22f, 3.41f, 22f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 22f, 21.09f, 21.78f, 21.09f, 21.5f)
                curveTo(21.09f, 17.36f, 17.01f, 14f, 12f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(10.82f, 2f, 9.74f, 2.41f, 8.88f, 3.1f)
                curveTo(7.73f, 4.01f, 7f, 5.42f, 7f, 7f)
                curveTo(7f, 7.94f, 7.26f, 8.82f, 7.73f, 9.57f)
                curveTo(8.59f, 11.02f, 10.17f, 12f, 12f, 12f)
                curveTo(13.26f, 12f, 14.41f, 11.54f, 15.29f, 10.75f)
                curveTo(15.68f, 10.42f, 16.02f, 10.02f, 16.28f, 9.57f)
                curveTo(16.74f, 8.82f, 17f, 7.94f, 17f, 7f)
                curveTo(17f, 4.24f, 14.76f, 2f, 12f, 2f)
                close()
                moveTo(14.59f, 6.46f)
                lineTo(11.92f, 8.92f)
                curveTo(11.74f, 9.09f, 11.51f, 9.17f, 11.28f, 9.17f)
                curveTo(11.04f, 9.17f, 10.8f, 9.08f, 10.62f, 8.9f)
                lineTo(9.39f, 7.66f)
                curveTo(9.02f, 7.29f, 9.02f, 6.7f, 9.39f, 6.33f)
                curveTo(9.76f, 5.96f, 10.35f, 5.96f, 10.72f, 6.33f)
                lineTo(11.31f, 6.92f)
                lineTo(13.32f, 5.07f)
                curveTo(13.7f, 4.72f, 14.29f, 4.74f, 14.64f, 5.12f)
                curveTo(14.99f, 5.51f, 14.97f, 6.11f, 14.59f, 6.46f)
                close()
            }
        }.build()

        return _UserTick!!
    }

@Suppress("ObjectPropertyName")
private var _UserTick: ImageVector? = null
