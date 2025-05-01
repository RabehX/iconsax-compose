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


val Iconsax.Filled.TagUser: ImageVector
    get() {
        if (_TagUser != null) {
            return _TagUser!!
        }
        _TagUser = ImageVector.Builder(
            name = "Filled.TagUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.34f, 2f, 3f, 3.33f, 3f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3f, 17.52f, 4.34f, 18.86f, 6f, 18.86f)
                horizontalLineTo(6.76f)
                curveTo(7.55f, 18.86f, 8.32f, 19.17f, 8.88f, 19.73f)
                lineTo(10.59f, 21.42f)
                curveTo(11.37f, 22.19f, 12.63f, 22.19f, 13.41f, 21.42f)
                lineTo(15.12f, 19.73f)
                curveTo(15.68f, 19.17f, 16.45f, 18.86f, 17.24f, 18.86f)
                horizontalLineTo(18f)
                curveTo(19.66f, 18.86f, 21f, 17.52f, 21f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21f, 3.33f, 19.66f, 2f, 18f, 2f)
                close()
                moveTo(12f, 5.55f)
                curveTo(13.08f, 5.55f, 13.95f, 6.43f, 13.95f, 7.5f)
                curveTo(13.95f, 8.56f, 13.11f, 9.41f, 12.07f, 9.45f)
                curveTo(12.03f, 9.45f, 11.97f, 9.45f, 11.92f, 9.45f)
                curveTo(10.87f, 9.41f, 10.04f, 8.56f, 10.04f, 7.5f)
                curveTo(10.05f, 6.43f, 10.92f, 5.55f, 12f, 5.55f)
                close()
                moveTo(14.75f, 14.69f)
                curveTo(13.24f, 15.7f, 10.76f, 15.7f, 9.25f, 14.69f)
                curveTo(7.92f, 13.81f, 7.92f, 12.35f, 9.25f, 11.46f)
                curveTo(10.77f, 10.45f, 13.25f, 10.45f, 14.75f, 11.46f)
                curveTo(16.08f, 12.35f, 16.08f, 13.8f, 14.75f, 14.69f)
                close()
            }
        }.build()

        return _TagUser!!
    }

@Suppress("ObjectPropertyName")
private var _TagUser: ImageVector? = null
