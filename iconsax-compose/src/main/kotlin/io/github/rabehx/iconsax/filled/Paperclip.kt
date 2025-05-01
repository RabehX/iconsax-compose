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


val Iconsax.Filled.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Filled.Paperclip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(16.75f, 13.71f)
                curveTo(16.75f, 15.23f, 15.52f, 16.46f, 14f, 16.46f)
                curveTo(12.48f, 16.46f, 11.25f, 15.23f, 11.25f, 13.71f)
                verticalLineTo(11.71f)
                curveTo(11.25f, 11.3f, 11.59f, 10.96f, 12f, 10.96f)
                curveTo(12.41f, 10.96f, 12.75f, 11.3f, 12.75f, 11.71f)
                verticalLineTo(13.71f)
                curveTo(12.75f, 14.4f, 13.31f, 14.96f, 14f, 14.96f)
                curveTo(14.69f, 14.96f, 15.25f, 14.4f, 15.25f, 13.71f)
                verticalLineTo(10.57f)
                curveTo(15.25f, 8.78f, 13.79f, 7.32f, 12f, 7.32f)
                curveTo(10.21f, 7.32f, 8.75f, 8.78f, 8.75f, 10.57f)
                verticalLineTo(14f)
                curveTo(8.75f, 15.48f, 9.95f, 16.68f, 11.43f, 16.68f)
                curveTo(11.84f, 16.68f, 12.18f, 17.02f, 12.18f, 17.43f)
                curveTo(12.18f, 17.84f, 11.84f, 18.18f, 11.43f, 18.18f)
                curveTo(9.13f, 18.18f, 7.25f, 16.3f, 7.25f, 14f)
                verticalLineTo(10.57f)
                curveTo(7.25f, 7.95f, 9.38f, 5.82f, 12f, 5.82f)
                curveTo(14.62f, 5.82f, 16.75f, 7.95f, 16.75f, 10.57f)
                verticalLineTo(13.71f)
                close()
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
