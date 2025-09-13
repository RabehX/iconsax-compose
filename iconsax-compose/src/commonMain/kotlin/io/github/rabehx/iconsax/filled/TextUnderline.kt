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


val Iconsax.Filled.TextUnderline: ImageVector
    get() {
        if (_TextUnderline != null) {
            return _TextUnderline!!
        }
        _TextUnderline = ImageVector.Builder(
            name = "Filled.TextUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 2f, 7.41f, 2.01f, 7.22f, 2.03f)
                curveTo(3.94f, 2.24f, 2f, 4.37f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(4.95f, 21.55f, 5.99f, 21.9f, 7.22f, 21.98f)
                curveTo(7.41f, 21.99f, 7.61f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(16.83f, 18.96f)
                horizontalLineTo(7.17f)
                curveTo(6.76f, 18.96f, 6.42f, 18.62f, 6.42f, 18.21f)
                curveTo(6.42f, 17.8f, 6.76f, 17.46f, 7.17f, 17.46f)
                horizontalLineTo(16.84f)
                curveTo(17.25f, 17.46f, 17.59f, 17.8f, 17.59f, 18.21f)
                curveTo(17.59f, 18.62f, 17.25f, 18.96f, 16.83f, 18.96f)
                close()
                moveTo(17.58f, 10.62f)
                curveTo(17.58f, 13.7f, 15.08f, 16.2f, 12f, 16.2f)
                curveTo(8.92f, 16.2f, 6.42f, 13.7f, 6.42f, 10.62f)
                verticalLineTo(5.79f)
                curveTo(6.42f, 5.38f, 6.76f, 5.04f, 7.17f, 5.04f)
                curveTo(7.58f, 5.04f, 7.92f, 5.38f, 7.92f, 5.79f)
                verticalLineTo(10.62f)
                curveTo(7.92f, 12.87f, 9.75f, 14.7f, 12f, 14.7f)
                curveTo(14.25f, 14.7f, 16.08f, 12.87f, 16.08f, 10.62f)
                verticalLineTo(5.79f)
                curveTo(16.08f, 5.38f, 16.42f, 5.04f, 16.83f, 5.04f)
                curveTo(17.24f, 5.04f, 17.58f, 5.38f, 17.58f, 5.79f)
                verticalLineTo(10.62f)
                close()
            }
        }.build()

        return _TextUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderline: ImageVector? = null
