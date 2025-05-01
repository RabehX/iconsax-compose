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


val Iconsax.Filled.MessageQuestion: ImageVector
    get() {
        if (_MessageQuestion != null) {
            return _MessageQuestion!!
        }
        _MessageQuestion = ImageVector.Builder(
            name = "Filled.MessageQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2.43f)
                horizontalLineTo(7f)
                curveTo(4f, 2.43f, 2f, 4.43f, 2f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(2f, 16.43f, 4f, 18.43f, 7f, 18.43f)
                verticalLineTo(20.56f)
                curveTo(7f, 21.36f, 7.89f, 21.84f, 8.55f, 21.39f)
                lineTo(13f, 18.43f)
                horizontalLineTo(17f)
                curveTo(20f, 18.43f, 22f, 16.43f, 22f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(22f, 4.43f, 20f, 2.43f, 17f, 2.43f)
                close()
                moveTo(12f, 14.6f)
                curveTo(11.58f, 14.6f, 11.25f, 14.26f, 11.25f, 13.85f)
                curveTo(11.25f, 13.44f, 11.58f, 13.1f, 12f, 13.1f)
                curveTo(12.42f, 13.1f, 12.75f, 13.44f, 12.75f, 13.85f)
                curveTo(12.75f, 14.26f, 12.42f, 14.6f, 12f, 14.6f)
                close()
                moveTo(13.26f, 10.45f)
                curveTo(12.87f, 10.71f, 12.75f, 10.88f, 12.75f, 11.16f)
                verticalLineTo(11.37f)
                curveTo(12.75f, 11.78f, 12.41f, 12.12f, 12f, 12.12f)
                curveTo(11.59f, 12.12f, 11.25f, 11.78f, 11.25f, 11.37f)
                verticalLineTo(11.16f)
                curveTo(11.25f, 10f, 12.1f, 9.43f, 12.42f, 9.21f)
                curveTo(12.79f, 8.96f, 12.91f, 8.79f, 12.91f, 8.53f)
                curveTo(12.91f, 8.03f, 12.5f, 7.62f, 12f, 7.62f)
                curveTo(11.5f, 7.62f, 11.09f, 8.03f, 11.09f, 8.53f)
                curveTo(11.09f, 8.94f, 10.75f, 9.28f, 10.34f, 9.28f)
                curveTo(9.93f, 9.28f, 9.59f, 8.94f, 9.59f, 8.53f)
                curveTo(9.59f, 7.2f, 10.67f, 6.12f, 12f, 6.12f)
                curveTo(13.33f, 6.12f, 14.41f, 7.2f, 14.41f, 8.53f)
                curveTo(14.41f, 9.67f, 13.57f, 10.24f, 13.26f, 10.45f)
                close()
            }
        }.build()

        return _MessageQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _MessageQuestion: ImageVector? = null
