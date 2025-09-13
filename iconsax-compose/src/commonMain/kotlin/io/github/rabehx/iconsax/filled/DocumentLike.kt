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


val Iconsax.Filled.DocumentLike: ImageVector
    get() {
        if (_DocumentLike != null) {
            return _DocumentLike!!
        }
        _DocumentLike = ImageVector.Builder(
            name = "Filled.DocumentLike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4.5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 4f, 19.5f, 2f, 16f, 2f)
                close()
                moveTo(13.07f, 15.49f)
                curveTo(12.56f, 17.12f, 10.77f, 17.97f, 10.27f, 17.97f)
                curveTo(9.78f, 17.96f, 8.01f, 17.13f, 7.48f, 15.49f)
                curveTo(7.15f, 14.46f, 7.54f, 13.19f, 8.61f, 12.84f)
                curveTo(9.18f, 12.66f, 9.88f, 12.81f, 10.27f, 13.36f)
                curveTo(10.64f, 12.79f, 11.37f, 12.66f, 11.93f, 12.84f)
                curveTo(13.01f, 13.19f, 13.39f, 14.46f, 13.07f, 15.49f)
                close()
                moveTo(18.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(14.98f, 9.25f, 13.75f, 8.02f, 13.75f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(13.75f, 4.09f, 14.09f, 3.75f, 14.5f, 3.75f)
                curveTo(14.91f, 3.75f, 15.25f, 4.09f, 15.25f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(15.25f, 7.19f, 15.81f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 7.75f, 19.25f, 8.09f, 19.25f, 8.5f)
                curveTo(19.25f, 8.91f, 18.91f, 9.25f, 18.5f, 9.25f)
                close()
            }
        }.build()

        return _DocumentLike!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLike: ImageVector? = null
