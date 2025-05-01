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


val Iconsax.Filled.KeyboardOpen: ImageVector
    get() {
        if (_KeyboardOpen != null) {
            return _KeyboardOpen!!
        }
        _KeyboardOpen = ImageVector.Builder(
            name = "Filled.KeyboardOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 22.75f, 6.25f, 22.41f, 6.25f, 22f)
                curveTo(6.25f, 21.59f, 6.59f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 21.25f, 17.75f, 21.59f, 17.75f, 22f)
                curveTo(17.75f, 22.41f, 17.41f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(3.79f, 2f, 2f, 3.79f, 2f, 6f)
                verticalLineTo(15f)
                curveTo(2f, 17.21f, 3.79f, 19f, 6f, 19f)
                horizontalLineTo(18f)
                curveTo(20.21f, 19f, 22f, 17.21f, 22f, 15f)
                verticalLineTo(6f)
                curveTo(22f, 3.79f, 20.21f, 2f, 18f, 2f)
                close()
                moveTo(9.99f, 7.32f)
                curveTo(10.55f, 7.32f, 11f, 7.77f, 11f, 8.32f)
                curveTo(11f, 8.87f, 10.55f, 9.32f, 10f, 9.32f)
                curveTo(9.45f, 9.32f, 9f, 8.87f, 9f, 8.32f)
                curveTo(9f, 7.77f, 9.44f, 7.32f, 9.99f, 7.32f)
                close()
                moveTo(6.84f, 7.32f)
                curveTo(7.4f, 7.32f, 7.85f, 7.77f, 7.85f, 8.32f)
                curveTo(7.85f, 8.87f, 7.4f, 9.32f, 6.85f, 9.32f)
                curveTo(6.3f, 9.32f, 5.85f, 8.87f, 5.85f, 8.32f)
                curveTo(5.85f, 7.77f, 6.28f, 7.32f, 6.84f, 7.32f)
                close()
                moveTo(17.26f, 14.86f)
                horizontalLineTo(6.76f)
                curveTo(6.34f, 14.86f, 6f, 14.52f, 6f, 14.11f)
                curveTo(6f, 13.7f, 6.33f, 13.36f, 6.74f, 13.36f)
                horizontalLineTo(17.27f)
                curveTo(17.68f, 13.36f, 18.02f, 13.7f, 18.02f, 14.11f)
                curveTo(18.02f, 14.52f, 17.68f, 14.86f, 17.26f, 14.86f)
                close()
                moveTo(17.26f, 9.07f)
                horizontalLineTo(13.58f)
                curveTo(13.17f, 9.07f, 12.83f, 8.73f, 12.83f, 8.32f)
                curveTo(12.83f, 7.91f, 13.17f, 7.57f, 13.58f, 7.57f)
                horizontalLineTo(17.26f)
                curveTo(17.67f, 7.57f, 18.01f, 7.91f, 18.01f, 8.32f)
                curveTo(18.01f, 8.73f, 17.68f, 9.07f, 17.26f, 9.07f)
                close()
            }
        }.build()

        return _KeyboardOpen!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardOpen: ImageVector? = null
